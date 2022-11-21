package org.example;


import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Logger;


public class WebServer {

    private static final Logger log = Logger.getLogger(String.valueOf(WebServer.class));

    private static final int port = 9696;

    public static void main(String[] args) {
        log.info("Hello web server");
        log.info("port {} "+ port);
        /**
         * 새로운 소켓이 들어 올때 마다 새로운 Thread를 실행 해준다.
         * */

        try{
            //server socket을 열어 주기
            ServerSocket listenSocket = new ServerSocket(port);

            Socket socket;
            //accept 신호를 받을때까지
            while((socket=listenSocket.accept()) !=null){
                log.info("socket start");

            }


        }catch (Exception e){

        }


    }

}
