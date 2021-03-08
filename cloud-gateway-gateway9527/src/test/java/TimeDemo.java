import org.bouncycastle.jcajce.provider.symmetric.Noekeon;

import java.time.ZonedDateTime;

/**
 * @author taylor
 * @Description: TODO
 * @date 2021/3/8 21:42
 */
public class TimeDemo {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);
        //2021-03-08T21:43:15.681+08:00[Asia/Shanghai]
    }
}
