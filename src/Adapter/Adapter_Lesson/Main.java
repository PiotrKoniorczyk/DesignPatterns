package Adapter.Adapter_Lesson;

import Adapter.Adapter_Lesson.Adapter.*;

import java.security.UnrecoverableKeyException;

public class Main {
    public static void main(String[] args) {

        ContinentalDevice radio = new ContinentalDevice() {
            public void on() {
                System.out.println("Play continental music");

            }
        };
        ContinentalSocket continentalSocket = new ContinentalSocket();

        continentalSocket.plugIn(radio);

        UkDevice UkRadio = new UkDevice() {
            public void powerOn() {
                System.out.println("Play UK music");

            }
        };

        ContinentalDevice ContinntalRadio = new ContinentalDevice() {
            public void on() {
                System.out.println("Play continental Radio");

            }
        };

        UkSocket ukSocket = new UkSocket();

        ukSocket.plugIn(UkRadio);

        //One way adapter
        System.out.println("----------------");
        System.out.println("One Way adapter");
        UkToContinentalAdapter adapter = new UkToContinentalAdapter(UkRadio);

        continentalSocket.plugIn(adapter);

        //Two way adapter
        System.out.println("----------------");
        System.out.println("Two Way adapter");
        TwoWayAdapter twoWayAdapter = new TwoWayAdapter(UkRadio,ContinntalRadio);
        continentalSocket.plugIn(twoWayAdapter);
        ukSocket.plugIn(twoWayAdapter);


    }
}
