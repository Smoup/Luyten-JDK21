package us.deathmarine.luyten;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class AsyncExecutor {

    private static final ExecutorService EXECUTOR =
            Executors.newVirtualThreadPerTaskExecutor();

    public static void execute(Runnable runnable) {
        EXECUTOR.execute(runnable);
    }
}
