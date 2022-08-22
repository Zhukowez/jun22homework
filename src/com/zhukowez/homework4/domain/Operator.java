package homework4.domain;

import java.util.Objects;
import java.util.concurrent.BlockingQueue;

public class Operator extends Thread {

    private final int id;
    private final BlockingQueue<Client> clientQueue;

    public Operator(int id, BlockingQueue<Client> clientQueue) {
        this.id = id;
        this.clientQueue = clientQueue;
    }

    @Override
    public long getId() {
        return id;
    }

    public BlockingQueue<Client> getClientQueue() {
        return clientQueue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Operator operator = (Operator) o;
        return id == operator.id && Objects.equals(clientQueue, operator.clientQueue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, clientQueue);
    }

    @Override
    public String toString() {
        return "Operator{" +
                "id=" + id +
                ", clientQueue=" + clientQueue +
                '}';
    }

    @Override
    public void run() {
        System.out.println("Оператор " + id + " начал работу");
        Client client = null;
        while (true) {
            try {
                if (clientQueue.isEmpty()) {
                    break;
                }
                client = clientQueue.take();
                System.out.println("Оператор " + id + " поговорил с юзером " + client.id);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Оператор " + id + " закончил работу");
    }

}
