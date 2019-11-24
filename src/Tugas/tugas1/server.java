/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas.tugas1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class server {

    public static DatagramSocket ds;
    public static int clientport = 800, serverport = 900;

    public static void main(String args[]) throws Exception {

        byte buffer[] = new byte[1024];
        ds = new DatagramSocket(serverport);

        File f = new File("soal.txt");
        BufferedReader dis = new BufferedReader(new FileReader(f));
        System.out.println("Server menunggu input");
        InetAddress i = InetAddress.getByName("Localhost");
        while (true) {
            System.out.print(" Server Mengirim file " + f);
            String str = dis.readLine();
            if ((str == null || str.equals("end"))) {
                break;
            }
            buffer = str.getBytes();
            ds.send(new DatagramPacket(buffer, str.length(), i, clientport));
        }
    }

}
