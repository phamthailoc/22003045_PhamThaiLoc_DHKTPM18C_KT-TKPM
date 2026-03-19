package com.example.composite;
public class File implements FileSystemElement {
    private String name;
    public File(String name) { this.name = name; }
    @Override
    public void showDetails(String indent) {
        System.out.println(indent + "- Tập tin: " + name);
    }
}