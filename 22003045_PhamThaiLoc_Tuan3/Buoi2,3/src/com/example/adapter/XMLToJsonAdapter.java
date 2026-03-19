package com.example.adapter;
public class XMLToJsonAdapter implements JsonTarget {
    private XMLService xmlService;
    public XMLToJsonAdapter(XMLService service) { this.xmlService = service; }
    @Override
    public String getJsonData() {
        String xml = xmlService.getXMLData();
        return "{ \"data\": { \"message\": \"Hello World\" } }";
    }
}