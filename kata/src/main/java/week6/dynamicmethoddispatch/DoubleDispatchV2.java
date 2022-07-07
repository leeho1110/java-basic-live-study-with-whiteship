package week6.dynamicmethoddispatch;

import java.util.Arrays;
import java.util.List;

public class DoubleDispatchV2 {
    interface Post {
        void postOn(SNS sns);
    }

    static class Text implements Post {
        public void postOn(SNS sns) {
            if(sns instanceof Facebook){
                System.out.println("text -> it's one and only for Facebook!");
            }
            if(sns instanceof Twitter){
                System.out.println("text -> it's one and only for Twitter!");
            }
        }
    }

    static class Picture implements Post {
        public void postOn(SNS sns) {
            if(sns instanceof Facebook){
                System.out.println("picture -> it's one and only for Facebook!");
            }
            if(sns instanceof Twitter){
                System.out.println("picture -> it's one and only for Twitter!");
            }
        }
    }

    interface SNS {
    }

    static class Facebook implements SNS {
    }

    static class Twitter implements SNS {
    }

    public static void main(String[] args) {
        List<Post> posts = Arrays.asList(new Text(), new Picture());
        List<SNS> sns = Arrays.asList(new Facebook(), new Twitter());

        posts.forEach(p -> sns.forEach(s -> p.postOn(s)));

        // text -> it's one and only for Facebook!
        // text -> it's one and only for Twitter!
        // picture -> it's one and only for Facebook!
        // picture -> it's one and only for Twitter!
    }
}
