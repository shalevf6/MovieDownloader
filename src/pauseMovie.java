/*
this class represent pausing movie state.
 */
public class pauseMovie implements ImovieDownloader{

    private Watch father;

    public pauseMovie(Watch father){
        this.father = father;
    }

    @Override
    public void restartMovie() {
        father.setCurrState(father.getWatchingMovie());
    }

    @Override
    public void holdMovie() {

    }

    @Override
    public void movieOff() {
        father.setCurrState(father.getIdleWatching());
    }

    @Override
    public void resume() {
        father.setCurrState(father.getWatchingMovie());
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
        father.setCurrState(father.getIdleWatching());
    }

    @Override
    public void downloadingDone() {
        father.setCurrState(father.getIdleWatching());
    }

    @Override
    public void entry() {
        System.out.println("enter pauseMovie state");
    }

    @Override
    public void exit() {
        System.out.println("exit pauseMovie state");
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
