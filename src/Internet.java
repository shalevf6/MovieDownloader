/*
this class represent the internet state.
 */
public class Internet implements ImovieDownloader {

    private ImovieDownloader internetOn;
    private ImovieDownloader internetOff;
    private ImovieDownloader currState;

    public Internet(DownloaderMachine machine) {
        this.internetOn = new internetOn(machine, this);
        this.internetOff = new internetOff();
        this.currState = internetOff;
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
        setCurrState(internetOff);
    }

    @Override
    public void internetOn() {
        currState.internetOn();
        setCurrState(internetOn);
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
    public ImovieDownloader getCurrState() {
        return currState;
    }

    @Override
    public void setCurrState(ImovieDownloader state) {
        this.currState.exit();
        this.currState = state;
        this.currState.entry();
    }

    @Override
    public void initDownloadingStatus(int movieSize) {
        currState.initDownloadingStatus(movieSize);
    }

    public ImovieDownloader getInternetOn() {
        return internetOn;
    }

    public ImovieDownloader getInternetOff() {
        return internetOff;
    }

    @Override
    public void entry() {
        System.out.println("enter Internet state");
        currState.entry();
    }

    @Override
    public void exit() {
        currState.exit();
        System.out.println("exit Internet state");
    }
}
