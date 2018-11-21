package Chapter4;

import java.util.LinkedList;

/**
 * Created by Doraemon on 2018/11/16.
 */
public class JavaList {
    static class LinkNode {
        private String value;
        private LinkNode next;

        public String getValue() {
            return value;
        }

        public LinkNode getNext() {
            return next;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public void setNext(LinkNode next) {
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LinkNode head = new LinkNode();
        LinkNode top = head;
        for (int index = 0; index < 10; index++) {
            LinkNode node = new LinkNode();
            head.setNext(node);
            head.setValue(index + "");
            head = node;
        }

        findNode(top);
    }

    public static void findNode(LinkNode node){
        if(node.getNext()== null){
            return;
        }
        System.out.println(node.getValue());
        findNode(node.getNext());

    }
}
