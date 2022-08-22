package homework4;

import homework4.domain.CallCenter;
import homework4.domain.Client;
import homework4.domain.Operator;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CallCenter callCenter = new CallCenter();

        // start work
        callCenter.startWork();

        // make clients
        for (int i = 0; i < callCenter.clientCount; i++) {
            callCenter.getQueue().put(new Client(i));
        }

        // make operators
        Operator[] operators = new Operator[callCenter.operatorCount];
        for (int i = 0; i < callCenter.operatorCount; i++) {
            operators[i] = new Operator(i, callCenter.getQueue());
        }

        // start operators
        for (int i = 0; i < callCenter.operatorCount; i++) {
            operators[i].start();
        }

        // wait for operators end their work
        for (int i = 0; i < callCenter.operatorCount; i++) {
            operators[i].join();
        }

        // end work of call center
        callCenter.endWork();
    }
}
