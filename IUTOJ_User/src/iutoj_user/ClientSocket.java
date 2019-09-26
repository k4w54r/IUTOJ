/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iutoj_user;

import java.io.*;
import java.net.Socket;
import java.net.SocketException;

/**
 *
 * @author ASADUZZAMAN HEROK
 */
public class ClientSocket {

    private Socket socket;
    private DataOutputStream dataout;
    private DataInputStream datain;

    public ClientSocket() throws IOException {
        this.socket = new Socket();
    }

    public int sendData(String data) {
        try {
            socket.setSoTimeout(5000);
            dataout.writeUTF(data);
            return data.length();
        } catch (SocketException ex) {
            return -2;
        } catch (IOException ex) {
            return -1;
        }

    }

    public String readData()
    {
        try{
            socket.setSoTimeout(3000);
            return datain.readUTF();
        } catch (IOException ex) {
            return "timeup";
        }
    }
    public boolean connect(String add, int port) {
        try {
            socket = new Socket(add, port);
            dataout = new DataOutputStream(socket.getOutputStream());
            datain = new DataInputStream(socket.getInputStream());
            dataout.writeUTF("Client");
            return true;
        } catch (IOException ex) {
            return false;
        }
    }

    public void close() throws IOException {
        socket.close();
    }

}