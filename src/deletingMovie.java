/*
this class represent deleting movie state.
 */
public class deletingMovie implements ImovieDownloader {

    //the machine
    private DownloaderMachine machine;
    private Download father;

    public deletingMovie(DownloaderMachine Dm, Download father){
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

    /*
    entering deleting movie state.
    decreasing score by one.
    remove the request.
    change state to idle.
     */
    @Override
    public void entry() {
        System.out.println("enter deletingMovie state");
        machine.setScore(machine.getScore()-1);
        machine.currMachineState.scoreChanged();
        machine.currMachineState.removeRequest();
        father.setCurrState(father.getIdleDownloading());
    }

    /*
    exiting deleting movie state.
    using movie off event to change watching state.
     */
    @Override
    public void exit() {
        machine.getCurrMachineState().movieOff();
        System.out.println("exit deletingMovie state");
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
