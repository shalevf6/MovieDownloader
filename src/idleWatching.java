/*
this class represent the idle state of the watching state.
 */
public class idleWatching implements ImovieDownloader  {

    private DownloaderMachine machine;
    private Watch father;

    public idleWatching(DownloaderMachine Dm, Watch father){
        this.machine = Dm;
        this.father = father;
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
        //check of 20% of the movie was downloaded and if in download the current state is downloading.
        if (machine.getDownloadingStatus() / machine.getMovieSize() * 100 >= 20 &&
                (father.getFather()).getDownloadState().getCurrState() instanceof downloadingMovie){
            father.setCurrState(father.getWatchingMovie());
        }
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
        System.out.println("enter idleWatching state");
    }

    @Override
    public void exit() {
        System.out.println("exit idleWatching state");
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
