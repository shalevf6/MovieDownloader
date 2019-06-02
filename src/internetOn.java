/*
this class represent the internet on state.
 */
public class internetOn implements ImovieDownloader {

    private ImovieDownloader father;
    private ImovieDownloader DownloadState;
    private ImovieDownloader WatchState;

    public internetOn(DownloaderMachine DM, Internet father){
        this.father = father;
        DownloadState = new Download(DM,this);
        WatchState = new Watch(DM,this);
    }

    @Override
    public void restartMovie() {
        DownloadState.restartMovie();
        WatchState.restartMovie();
    }

    @Override
    public void holdMovie() {
        DownloadState.holdMovie();
        WatchState.holdMovie();
    }

    @Override
    public void movieOff() {
        DownloadState.movieOff();
        WatchState.movieOff();
    }

    @Override
    public void resume() {
        DownloadState.resume();
        WatchState.resume();
    }

    @Override
    public void movieOn() {
        DownloadState.movieOn();
        WatchState.movieOn();
    }

    @Override
    public void errorFixed() {
        DownloadState.errorFixed();
        WatchState.errorFixed();
    }

    @Override
    public void downloadError() {
        DownloadState.downloadError();
        WatchState.downloadError();
    }

    @Override
    public void downloadAborted() {
        DownloadState.downloadAborted();
        WatchState.downloadAborted();
    }

    @Override
    public void fileRequest() {
        DownloadState.fileRequest();
        WatchState.fileRequest();
    }

    @Override
    public void internetOff() {
        DownloadState.internetOff();
        WatchState.internetOff();
    }

    @Override
    public void internetOn() {
        DownloadState.internetOn();
        WatchState.internetOn();
    }

    @Override
    public void turnOff() {
        DownloadState.turnOff();
        WatchState.turnOff();
    }

    @Override
    public void turnOn() {
        DownloadState.turnOn();
        WatchState.turnOn();
    }

    @Override
    public void removeRequest() {
        DownloadState.removeRequest();
        WatchState.removeRequest();
    }

    @Override
    public void scoreChanged() {
        DownloadState.scoreChanged();
        WatchState.scoreChanged();
    }

    @Override
    public void QisNotEmpty() {
        DownloadState.QisNotEmpty();
        WatchState.QisNotEmpty();
    }

    @Override
    public void checkSpace() {
        DownloadState.checkSpace();
        WatchState.checkSpace();
    }

    @Override
    public void updateDownloadStatus() {
        DownloadState.updateDownloadStatus();
        WatchState.updateDownloadStatus();
    }

    @Override
    public void inDeletingMovie() {
        DownloadState.inDeletingMovie();
        WatchState.inDeletingMovie();
    }


    @Override
    public void downloadingDone() {
        DownloadState.downloadingDone();
        WatchState.downloadingDone();
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
        DownloadState.initDownloadingStatus(movieSize);
        WatchState.initDownloadingStatus(movieSize);
    }

    public ImovieDownloader getFather() {
        return father;
    }

    public ImovieDownloader getDownloadState() {
        return DownloadState;
    }

    public ImovieDownloader getWatchState() {
        return WatchState;
    }

    @Override
    public void entry() {
        System.out.println("enter internetOn state");
        DownloadState.entry();
        WatchState.entry();
    }

    @Override
    public void exit() {
        DownloadState.exit();
        WatchState.exit();
        System.out.println("exit internetOn state");
    }
}
