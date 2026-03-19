package com.example.main;
import com.example.composite.*;
import com.example.observer.*;
import com.example.adapter.*;

public class MainAppPart2 {
    public static void main(String[] args) {
        System.out.println("--- 1. TEST COMPOSITE PATTERN ---");
        Folder root = new Folder("C:");
        Folder docs = new Folder("Documents");
        docs.addElement(new File("resume.pdf"));
        docs.addElement(new File("notes.txt"));
        root.addElement(docs);
        root.addElement(new File("image.png"));
        root.showDetails("");

        System.out.println("\n--- 2. TEST OBSERVER PATTERN ---");
        Stock apple = new Stock("AAPL", 150.0);
        Investor inv1 = new Investor("An");
        Investor inv2 = new Investor("Bình");
        apple.registerObserver(inv1);
        apple.registerObserver(inv2);
        apple.updatePrice(155.5);

        System.out.println("\n--- 3. TEST ADAPTER PATTERN ---");
        XMLService oldService = new XMLService();
        JsonTarget adapter = new XMLToJsonAdapter(oldService);
        System.out.println("Dữ liệu nhận được (đã chuyển đổi): " + adapter.getJsonData());
    }
}