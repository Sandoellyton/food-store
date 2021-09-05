package br.edu.ifpb.padroes.service.log.handlers;

public class LogHandlerData implements LogHandler {
    public void log(String message) {
        System.out.println("## save data to database ##");
    }
}
