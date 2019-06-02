/*
this class represent a beginner status of the user.
 */
public class beginner implements ImovieDownloader {

    //the machine.
    private DownloaderMachine machine;
    private userStatus father;

    public beginner(DownloaderMachine Dm, userStatus father){
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

    /*
        this function check if the status need to be change because of a score change of the user.
     */
    @Override
    public void scoreChanged() {
        //setting to a advanced status
        if (machine.getScore() > 3 && machine.getScore() < 7){
            machine.setSpeedRate(1.2);
            father.setCurrState(father.getAdvanced());
        }
        //setting to a professional status
        else if (machine.getScore() > 6){
            machine.setSpeedRate(1.5);
            father.setCurrState(father.getProfessional());
        }
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
    entering beginner status.
     */
    @Override
    public void entry() {
        System.out.println("enter beginner state");
    }

    /*
    exiting beginner status.
     */
    @Override
    public void exit() {
        System.out.println("exit beginner state");
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
