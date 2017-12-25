package Concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

public class Concurtest1 {
    public static void main(String[] args) throws Exception {

        Callable<String> callable = () -> "dsfsdfsd";
        Callable<Integer> callable12 = () -> {
            return null;
        };

        Thread t = new Thread();

        ExecutorService service = Executors.newSingleThreadExecutor();

        service.submit(() -> {
            return null;
        });

    }
}
