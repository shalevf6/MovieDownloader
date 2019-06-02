/*
this class represent the error during the downloading process
 */
public class errorOccurred implements ImovieDownloader, Runnable{
    private DownloaderMachine machine;

    private Download father;

    //the thread of the class.
    private Thread errorThread = new Thread(this);

    public errorOccurred(DownloaderMachine dm, Download father) {
        machine = dm;
        this.father = father;
    }

    @Override
    public void run() {
        int counter = 0;
        while (counter < 3 && !Thread.interrupted()) {
            try {
                Thread.sleep(1000);
                counter++;
            } catch (InterruptedException e) {
                return;
            }
        }
        //check of the counter is 3, if it is deleting movie.
        if (counter == 3) {
            machine.setCurrFreeSpace(machine.getCurrFreeSpace() + machine.getMovieSize());
            father.setCurrState(father.getDeletingMovie());
        }
        else
            father.setCurrState(father.getDownloadingMovie());
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
        father.setCurrState(father.getDownloadingMovie());
    }

    @Override
    public void downloadError() {

    }

    @Override
    public void downloadAborted() {

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

    @Override
    public void downloadingDone() {

    }

    @Override
    public void entry() {
        System.out.println("enter errorOccured state");
        errorThread = new Thread(this);
        errorThread.start();
    }

    @Override
    public void exit() {
        errorThread.interrupt();
        System.out.println("exit errorOccured state");
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

