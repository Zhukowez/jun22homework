package homework4.domain;

import java.util.Objects;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class CallCenter {

    BlockingQueue<Client> queue;
    //number of operators
    public int operatorCount = 4;
    //number of clients
    public int clientCount = 100;

    public CallCenter() {
        queue = new ArrayBlockingQueue<>(clientCount);
    }

    public CallCenter(BlockingQueue<Client> queue, int operatorCount, int clientCount) {
        this.queue = queue;
        this.operatorCount = operatorCount;
        this.clientCount = clientCount;
    }

    public BlockingQueue<Client> getQueue() {
        return queue;
    }

    public void setQueue(BlockingQueue<Client> queue) {
        this.queue = queue;
    }

    public int getOperatorCount() {
        return operatorCount;
    }

    public void setOperatorCount(int operatorCount) {
        this.operatorCount = operatorCount;
    }

    public int getClientCount() {
        return clientCount;
    }

    public void setClientCount(int clientCount) {
        this.clientCount = clientCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CallCenter that = (CallCenter) o;
        return operatorCount == that.operatorCount && clientCount == that.clientCount && Objects.equals(queue, that.queue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queue, operatorCount, clientCount);
    }

    @Override
    public String toString() {
        return "CallCenter{" +
                "queue=" + queue +
                ", operatorCount=" + operatorCount +
                ", clientCount=" + clientCount +
                '}';
    }

    public void startWork() {
        System.out.println("Колцентр начал работу");
    }

    public void endWork() {
        System.out.println("Колцентр закончил работу");
    }

}
