package cc.leevi.download1;

import org.apache.commons.lang3.RandomStringUtils;

import java.io.IOException;

public class WriteTest {
    public static void main(String[] args) throws IOException {
        for(int i = 0;i<1000;i++){
            try {
                Thread.sleep(200);
                System.out.println(RandomStringUtils.randomPrint(5));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
