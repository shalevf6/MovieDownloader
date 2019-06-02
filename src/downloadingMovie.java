/*
this class represent the downloading movie state.
 */
public class downloadingMovie implements ImovieDownloader,Runnable {

    private DownloaderMachine machine;
    private Download father;

    //the thread of the download.
    private Thread downloadingThread = new Thread(this);

    public downloadingMovie(DownloaderMachine dm, Download father) {
        machine = dm;
        this.father = father;
    }

    @Override
    public void run() {
        while (!Thread.interrupted() && machine.getDownloadingStatus() < machine.getMovieSize()) {
            machine.setDownloadingStatus(machine.getDownloadingStatus() + machine.getSpeedRate());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
        downloadingDone();
    }

    public void entry() {
        System.out.println("enter downloadingMovie state");
        machine.setCurrFreeSpace(machine.getCurrFreeSpace() - machine.getMovieSize());
        downloadingThread = new Thread(this);
        downloadingThread.start();
    }

    public void exit() {
        downloadingThread.interrupt();
        System.out.println("exit downloadingMovie state");
    }

    @Override
    public void restartMovie() {

    }

    @Override
    public void holdMovie() {

    }

    @Override
    public void movieOff() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void movieOn() {

    }

    @Override
    public void errorFixed() {

    }

    @Override
    public void downloadError() {
        father.setCurrState(father.getErrorOccurred());
        machine.getCurrMachineState().movieOff();
    }

    @Override
    public void downloadAborted() {
        machine.setCurrFreeSpace(machine.getCurrFreeSpace() + machine.getMovieSize());
        father.setCurrState(father.getDeletingMovie());
    }

    @Override
    public void fileRequest() {

    }

    @Override
    public void internetOff() {

    }

    @Override
    public void internetOn() {

    }

    @Override
    public void turnOff() {

    }

    @Override
    public void turnOn() {

    }

    @Override
    public void removeRequest() {

    }

    @Override
    public void scoreChanged() {

    }

    @Override
    public void QisNotEmpty() {

    }

    @Override
    public void checkSpace() {

    }

    @Override
    public void updateDownloadStatus() {

    }

    @Override
    public void inDeletingMovie() {

    }

    /**
     * the download is done.
     * increasing the score of the user.
     * remove the request.
     * check for user status change.
     * change state to idle downloading.
     */
    @Override
    public void downloadingDone() {
        machine.setScore(machine.getScore() + 1);
        machine.getCurrMachineState().movieOff();
        machine.getCurrMachineState().removeRequest();
        machine.getCurrMachineState().scoreChanged();
        father.setCurrState(father.getIdleDownloading());
    }

    @Override
    public ImovieDownloader getCurrState() {
        return null;
    }

    @Override
    public void setCurrState(ImovieDownloader state) {

    }

    @Override
    public void initDownloadingStatus(int movieSize) {

    }
}
