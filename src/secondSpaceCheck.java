/**
 * this class represent the second space check state.
 */
public class secondSpaceCheck implements ImovieDownloader, Runnable {

    DownloaderMachine machine;
    Download father;

    //the private thread of the class.
    private Thread secondCheckThread = new Thread(this);

    public secondSpaceCheck(DownloaderMachine dm, Download download) {
        this.father = download;
        this.machine = dm;
    }

    @Override
    public void run() {
        int counter = 0;
        while (counter < 4 && !Thread.interrupted()) {
            try {
                Thread.sleep(1000);
                counter++;
            } catch (InterruptedException e) {
                return;
            }
        }
        //check if there is space for the movie.
        //if there is start downloading.
        if(machine.getCurrFreeSpace() >= machine.getMovieSize()){
            machine.getCurrMachineState().initDownloadingStatus(machine.getMovieSize());
            father.setCurrState(father.getDownloadingMovie());
        }
        //else deleting movie.
        else {
            father.setCurrState(father.getDeletingMovie());
        }
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
        System.out.println("enter secondSpaceCheck state");
        secondCheckThread = new Thread(this);
        secondCheckThread.start();
    }

    @Override
    public void exit() {
        secondCheckThread.interrupt();
        System.out.println("exit secondSpaceCheck state");
    }

    @Override
    public ImovieDownloader getCurrState() {
        return null;
    }

    @Override
    public void setCurrState(ImovieDownloader state) {

    }

    @Override
    public void initDownloadingStatus(int currentMovieSize) {

    }
}
