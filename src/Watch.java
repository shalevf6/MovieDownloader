/**
 * this class represent the watch state.
 */
public class Watch implements ImovieDownloader{

    private DownloaderMachine machine;
    private internetOn father;
    private ImovieDownloader currState;

    private idleWatching idleWatching;
    private pauseMovie pauseMovie;
    private WatchingMovie watchingMovie;

    public Watch(DownloaderMachine DM, internetOn father){
        this.machine = DM;
        this.father = father;

        //sub states of the watch state.
        idleWatching = new idleWatching(DM,this);
        pauseMovie = new pauseMovie(this);
        watchingMovie = new WatchingMovie(DM,this);
        currState = idleWatching;
    }

    public DownloaderMachine getMachine() {
        return machine;
    }

    public void setMachine(DownloaderMachine machine) {
        this.machine = machine;
    }

    public internetOn getFather() {
        return father;
    }

    public ImovieDownloader getCurrState() {
        return currState;
    }

    public void setCurrState(ImovieDownloader currState) {
        this.currState.exit();
        this.currState = currState;
        this.currState.entry();
    }

    public idleWatching getIdleWatching() {
        return idleWatching;
    }

    public pauseMovie getPauseMovie() {
        return pauseMovie;
    }

    public WatchingMovie getWatchingMovie() {
        return watchingMovie;
    }

    @Override
    public void initDownloadingStatus(int movieSize) {
        currState.initDownloadingStatus(movieSize);
    }


    @Override
    public void restartMovie() {
        currState.restartMovie();
    }

    @Override
    public void holdMovie() {
        currState.holdMovie();
    }

    @Override
    public void movieOff() {
        currState.movieOff();
    }

    @Override
    public void resume() {
        currState.resume();
    }

    @Override
    public void movieOn() {
        currState.movieOn();
    }

    @Override
    public void errorFixed() {
        currState.errorFixed();
    }

    @Override
    public void downloadError() {
        currState.downloadError();
    }

    @Override
    public void downloadAborted() {
        currState.downloadAborted();
    }

    @Override
    public void fileRequest() {
        currState.fileRequest();
    }

    @Override
    public void internetOff() {
        currState.internetOff();
    }

    @Override
    public void internetOn() {
        currState.internetOn();
    }

    @Override
    public void turnOff() {
        currState.turnOff();
    }

    @Override
    public void turnOn() {
        currState.turnOn();
    }

    @Override
    public void removeRequest() {
        currState.removeRequest();
    }

    @Override
    public void scoreChanged() {
        currState.scoreChanged();
    }

    @Override
    public void QisNotEmpty() {
        currState.QisNotEmpty();
    }

    @Override
    public void checkSpace() {
        currState.checkSpace();
    }

    @Override
    public void updateDownloadStatus() {
        currState.updateDownloadStatus();
    }

    @Override
    public void inDeletingMovie() {
        currState.inDeletingMovie();
    }


    @Override
    public void downloadingDone() {
        currState.downloadingDone();
    }

    @Override
    public void entry() {
        System.out.println("enter Watch state");
        currState.entry();
    }

    @Override
    public void exit() {
        currState.exit();
        System.out.println("exit Watch state");
    }
}
