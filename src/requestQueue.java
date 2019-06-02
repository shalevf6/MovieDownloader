/**
 * this class represent the request queue.
 */
public class requestQueue implements ImovieDownloader {

    private DownloaderMachine machine;
    private ImovieDownloader queueM;

    public requestQueue(DownloaderMachine DM){
        this.machine = DM;
        queueM = new queueM(machine, this);
    }

    @Override
    public void turnOff() {
        queueM.turnOff();
    }

    @Override
    public void turnOn() {
        queueM.turnOn();
    }

    @Override
    public void restartMovie() {
        queueM.restartMovie();
    }

    @Override
    public void holdMovie() {
        queueM.holdMovie();
    }

    @Override
    public void movieOff() {
        queueM.movieOff();
    }

    @Override
    public void resume() {
        queueM.resume();
    }

    @Override
    public void movieOn() {
        queueM.movieOn();
    }

    @Override
    public void errorFixed() {
        queueM.errorFixed();
    }

    @Override
    public void downloadError() {
        queueM.downloadError();
    }

    @Override
    public void downloadAborted() {
        queueM.downloadAborted();
    }

    @Override
    public void fileRequest() {
        queueM.fileRequest();
    }

    @Override
    public void internetOff() {
        queueM.internetOff();
    }

    @Override
    public void internetOn() {
        queueM.internetOn();
    }

    @Override
    public void removeRequest() {
        queueM.removeRequest();
    }

    @Override
    public void scoreChanged() {
        queueM.scoreChanged();
    }

    @Override
    public void QisNotEmpty() {
        queueM.QisNotEmpty();
    }

    @Override
    public void checkSpace() {
        queueM.checkSpace();
    }

    @Override
    public void updateDownloadStatus() {
        queueM.updateDownloadStatus();
    }

    @Override
    public void inDeletingMovie() {
        queueM.inDeletingMovie();
    }

    @Override
    public void downloadingDone() {
        queueM.downloadingDone();
    }

    @Override
    public ImovieDownloader getCurrState() {
        return queueM;
    }

    @Override
    public void setCurrState(ImovieDownloader state) {

    }

    @Override
    public void initDownloadingStatus(int movieSize) {
        queueM.initDownloadingStatus(movieSize);
    }

    @Override
    public void entry() {
        System.out.println("enter requestQueue state");
        queueM.entry();
    }

    @Override
    public void exit() {
        queueM.exit();
        System.out.println("exit requestQueue state");
    }
}
