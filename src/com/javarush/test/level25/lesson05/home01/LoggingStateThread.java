package com.javarush.test.level25.lesson05.home01;



/**
 * Created by advirtys on 13.12.15.
 */
public class LoggingStateThread extends Thread
{
    Thread target;
    public LoggingStateThread(Thread target)
    {
        this.target = target;
        setDaemon(true);
    }
    @Override
    public void run()
    {

        State state = target.getState();
        System.out.println(state);
        while(state != State.TERMINATED)
        {
            if (state != target.getState())
            {
                System.out.println(target.getState());
                state = target.getState();
            }
        }
        interrupt();
    }
}
