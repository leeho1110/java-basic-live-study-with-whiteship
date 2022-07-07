package week6.dynamicmethoddispatch;

import java.util.Arrays;
import java.util.List;

public class DoubleDispatchV4 {
    interface Post {
        void postOn(SNS sns);
    }

    static class Text implements Post {
        public void postOn(SNS sns) {
            sns.post(this);
        }
    }

    static class Picture implements Post {
        public void postOn(SNS sns) {
            sns.post(this);
        }
    }

    interface SNS {
        void post(Text post);
        void post(Picture picture);
    }

    static class Facebook implements SNS {
        @Override
        public void post(Text post) {
            System.out.println("Invoke Text-facebook!");
        }

        @Override
        public void post(Picture picture) {
            System.out.println("Invoke Picture-facebook!");
        }
    }

    static class Twitter implements SNS {
        @Override
        public void post(Text post) {
            System.out.println("Invoke Text-Twitter!");
        }

        @Override
        public void post(Picture picture) {
            System.out.println("Invoke Picture-Twitter!");
        }
    }

    static class GooglePlay implements SNS {
        @Override
        public void post(Text post) {
            System.out.println("Invoke Text-GooglePlay!");
        }

        @Override
        public void post(Picture picture) {
            System.out.println("Invoke Picture-GooglePlay!");
        }
    }

    public static void main(String[] args) {
        List<Post> posts = Arrays.asList(new Text(), new Picture());
        List<SNS> sns = Arrays.asList(new Facebook(), new Twitter(), new GooglePlay());

        for (Post p : posts) {
            for (SNS s : sns) {
                p.postOn(s);
            }
        }

        // Invoke Text-facebook!
        // Invoke Text-Twitter!
        // Invoke Text-GooglePlay!
        // Invoke Picture-facebook!
        // Invoke Picture-Twitter!
        // Invoke Picture-GooglePlay!
    }
}
