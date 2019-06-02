/**
 * this class represent the queue of the requests.
 */
public class queueM implements ImovieDownloader {


    private DownloaderMachine machine;

    private requestQueue father;

    public queueM(DownloaderMachine DM, requestQueue father) {
        machine = DM;
        this.father = father;
    }

    public requestQueue getFather() {
        return father;
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
        machine.setDownloadingStatus(0.0);
        machine.setMovieSize(0);
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
        System.out.println("enter queueM state");
    }

    @Override
    public void exit() {
        System.out.println("exit queueM state");
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
        machine.setMovieSize(movieSize);
        machine.setDownloadingStatus(0.0);
    }
}
