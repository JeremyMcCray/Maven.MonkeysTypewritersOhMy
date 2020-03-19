package io.zipcoder;

import java.util.ArrayList;

/**
 * Modify the run function so that the monkeys each grab the next word and write it to the copy.
 */
public class UnsafeCopier extends Copier {



    public UnsafeCopier(String toCopy) {
        super(toCopy);

    }

    @Override
    public void run() {
        while (this.stringIterator.hasNext()){
            try {

            this.copied+=stringIterator.next() + " ";
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
