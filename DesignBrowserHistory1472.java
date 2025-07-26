package leet;

import java.util.ArrayList;
import java.util.List;

public class DesignBrowserHistory1472 {
    private class Node {
        String url;
        Node next;
        Node prev;

        public Node(String url) {
            this.url = url;
            this.next = null;
            this.prev = null;
        }
    }

    Node head;

    public DesignBrowserHistory1472(String homepage) {
        this.head = new Node(homepage);
    }

    public void visit(String url) {
        if (url.equals("")) return;
        Node old = head;
        old.next = null; // drop any forward history
        Node vist = new Node(url);
        vist.prev = old;
        old.next = vist; // link in the new page
        head = vist;     // make it current
        vist.next = null;// it has no forward pages now
    }

    public String back(int steps) {
        int i = 0;
        if (steps <= 0) return head.url;

        Node curr = head;
        while (i < steps && curr.prev != null) {
            curr = curr.prev;
            i++;
        }

        head = curr;
        return head.url;
    }

    public String forward(int steps) {
        int i = 0;
        if (steps <= 0) return head.url;

        Node curr = head;
        while (i < steps && curr.next != null) {
            curr = curr.next;
            i++;
        }

        head = curr;
        return head.url;
    }

    public static void main(String[] args) {
        String[] ops = { "BrowserHistory", "visit", "visit", "visit", "back", "back", "forward",
                "visit", "forward", "back", "back" };
        Object[][] params = {
                { "leetcode.com" }, { "google.com" }, { "facebook.com" }, { "youtube.com" },
                { 1 }, { 1 }, { 1 }, { "linkedin.com" }, { 2 }, { 2 }, { 7 }
        };

        List<String> output = new ArrayList<>();
        DesignBrowserHistory1472 browser = null;

        for (int i = 0; i < ops.length; i++) {
            switch (ops[i]) {
                case "BrowserHistory":
                    browser = new DesignBrowserHistory1472((String) params[i][0]);
                    output.add(null);
                    break;
                case "visit":
                    browser.visit((String) params[i][0]);
                    output.add(null);
                    break;
                case "back":
                    output.add(browser.back((Integer) params[i][0]));
                    break;
                case "forward":
                    output.add(browser.forward((Integer) params[i][0]));
                    break;
                default:
                    output.add(null);
            }
        }

        System.out.println(output);
    }
}
