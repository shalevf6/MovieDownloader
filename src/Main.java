import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        //init variables.
        Scanner myObj = new Scanner(System.in);
        String event;

        DownloaderMachine machine = new DownloaderMachine();

        //menu for the user.
        System.out.println("enter your events by the following numbers : \n" +
                "1 - turnOn \n" +
                "2 - turnOff \n" +
                "3 - internetOn \n" +
                "4 - internetOff \n" +
                "5 - fileRequest \n" +
                "6 - downloadAborted \n" +
                "7 - downloadError \n" +
                "8 - errorFixed \n" +
                "9 - movieOn \n" +
                "10 - restartMovie \n" +
                "11 - holdMovie \n" +
                "12 - movieOff \n" +
                "13 - resume  \n" +
                "14 - change disk size");
        event = myObj.nextLine();

        //stopping only when the machine state will be turn off.
        while (!event.equals("2")) {

            switchMethod(machine,event,myObj);

            myObj = new Scanner(System.in);
            event = myObj.nextLine();
        }
    }

    /**
     * this function gets the user input and active the right event.
     * @param machine - the machine/
     * @param event - the given event to execute.
     * @param myObj - scanner for the user input.
     */
    private static void switchMethod(DownloaderMachine machine,String event,Scanner myObj) {
        switch(event) {
            case "1":
                machine.currMachineState.turnOn();
                break;
            case "2":
                machine.currMachineState.turnOff();
                break;
            case "3":
                machine.currMachineState.internetOn();
                break;
            case "4":
                machine.currMachineState.internetOff();
                break;
            case "5":
                //check the machine is on
                if (machine.currMachineState instanceof turnOn) {
                    //check the internet is on.
                    if (((turnOn)machine.currMachineState).getInternetState().getCurrState() instanceof internetOn) {
                        boolean done =false;
                        //loop until number is entered.
                        while (!done){
                            System.out.println("please enter the file size");
                            myObj = new Scanner(System.in);
                            event = myObj.nextLine();
                            if (event.matches("-?\\d+(\\.\\d+)?"))
                                done = true;
                        }
                    }
                }
                machine.setMovieSize(Integer.parseInt(event));
                machine.currMachineState.fileRequest();
                break;
            case "6":
                machine.currMachineState.downloadAborted();
                break;
            case "7":
                machine.currMachineState.downloadError();
                break;
            case "8":
                machine.currMachineState.errorFixed();
                break;
            case "9":
                machine.currMachineState.movieOn();
                break;
            case "10":
                machine.currMachineState.restartMovie();
                break;
            case "11":
                machine.currMachineState.holdMovie();
                break;
            case "12":
                machine.currMachineState.movieOff();
                break;
            case "13":
                machine.currMachineState.resume();
                break;
            case "14":
                boolean done =false;
                //loop until number is entered.
                while (!done){
                    System.out.println("please enter the disk size");
                    myObj = new Scanner(System.in);
                    event = myObj.nextLine();
                    if (event.matches("-?\\d+(\\.\\d+)?"))
                        done = true;
                }
                machine.setCurrFreeSpace(Integer.parseInt(event));
                break;
        }

    }
}
