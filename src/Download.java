/*
this class represent the whole downloading status.
 */
public class Download implements ImovieDownloader {

    private internetOn father;
    private ImovieDownloader currState;

    //all of the sub states of this state.
    private idleDownloading idleDownloading;
    private firstSpaceCheck firstSpaceCheck;
    private secondSpaceCheck secondSpaceCheck;
    private deletingMovie deletingMovie;
    private errorOccurred errorOccurred;
    private downloadingMovie downloadingMovie;

    public Download(DownloaderMachine DM, internetOn father){
        currState = new idleDownloading(DM,this);
        this.father = father;
        idleDownloading = new idleDownloading(DM,this);
        firstSpaceCheck = new firstSpaceCheck(DM,this);
        secondSpaceCheck = new secondSpaceCheck(DM,this);
        deletingMovie = new deletingMovie(DM,this);
        errorOccurred = new errorOccurred(DM,this);
        downloadingMovie = new downloadingMovie(DM,this);
    }

    public internetOn getFather() {
        return father;
    }

    public ImovieDownloader getCurrState() {
        return currState;
    }

    /**
     * setting the current state be the give one.
     * @param currState - the given state.
     */
    public void setCurrState(ImovieDownloader currState) {
        this.currState.exit();
        this.currState = currState;
        this.currState.entry();
    }

    public idleDownloading getIdleDownloading() {
        return idleDownloading;
    }

    public firstSpaceCheck getFirstSpaceCheck() {
        return firstSpaceCheck;
    }

    public secondSpaceCheck getSecondSpaceCheck() {
        return secondSpaceCheck;
    }

    public deletingMovie getDeletingMovie() {
        return deletingMovie;
    }

    public errorOccurred getErrorOccurred() {
        return errorOccurred;
    }

    public downloadingMovie getDownloadingMovie() {
        return downloadingMovie;
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
        this.entry();
        currState.entry();
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
        System.out.println("enter Download state");
        currState.entry();
    }

    @Override
    public void exit() {
        currState.exit();
        System.out.println("exit Download state");
    }
}
