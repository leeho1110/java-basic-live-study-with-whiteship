package week6.dynamicmethoddispatch;

import java.util.Arrays;
import java.util.List;

public class DoubleDispatchV3 {
    interface Post {
        void postOn(Facebook facebook);
        void postOn(Twitter twitter);
    }

    static class Text implements Post {
        public void postOn(Facebook sns) {
            System.out.println("text -> it's one and only for Facebook!");
        }
        public void postOn(Twitter sns) {
            System.out.println("text -> it's one and only for Twitter!");
        }
    }

    static class Picture implements Post {
        public void postOn(Facebook sns) {
            System.out.println("picture -> it's one and only for Facebook!");
        }
        public void postOn(Twitter sns) {
            System.out.println("picture -> it's one and only for Twitter!");
        }
    }

    interface SNS {    }

    static class Facebook implements SNS {    }

    static class Twitter implements SNS {    }

    public static void main(String[] args) {
        List<Post> posts = Arrays.asList(new Text(), new Picture());
        List<SNS> sns = Arrays.asList(new Facebook(), new Twitter());

        // posts.forEach(p -> sns.forEach(s -> p.postOn(s))); // Cannot resolve method 'postOn(SNS)'

        /*
            여기서 s는 사실 SNS 타입이다. 메서드 오버로딩은 다이나믹 메서드 디스패칭이 아닌 스태틱 매서드 디스패치를 사용한다.
            하지만 Post 클래스의 postOn()에는 각각 세부 타입(Facebook, Twitter)로 정의되어 있기 때문이다.
         */
    }
}
