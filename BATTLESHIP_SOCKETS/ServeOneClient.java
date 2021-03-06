/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.net.Socket;

/**
 * @author dsmis
 * @member default
 * @name ServeOneClient
 * @description Class handling the loading of the elements to the handling for
 * the game logic and a messenger store for the socket communication.
 */
class ServeOneClient extends Thread {

    // Game logic handlers
    private BattleShipGameLogic gameLogic;
    
    // Communication handlers
    private Socket servedSocket;
    private BufferedReader inFromServer;
    private PrintWriter outToServer;

    /**
     * @author dsmis
     * @member ServeOneClient
     * @name ServeOneClient
     * @description Constructor
     * @param socket {Socket} socket send by the 
     * server for a client to connect to. 
     * @param gameLogic {BattleShipGameLogic} the game logic 
     * to from the serve (used only for adding and removing clients)
     */
    public ServeOneClient(Socket socket, BattleShipGameLogic gameLogic) throws Exception {
        this.servedSocket = socket;
        this.gameLogic = gameLogic;

        inFromServer = new BufferedReader(
                new InputStreamReader(
                        servedSocket.getInputStream()));

        outToServer = new PrintWriter(new BufferedWriter(
                new OutputStreamWriter(
                        servedSocket.getOutputStream()
                )
        ), true);

        gameLogic.addConnection(outToServer);
    }

    @Override
    public void run() {
        try {
            while (true) {
                String str = inFromServer.readLine();
                if (str.equals("GAME_IS_OFF")) {
                    break;
                }
                gameLogic.setCommand(str);
            }
            gameLogic.removeClient(outToServer);
            System.out.println("disconected a client..");
            servedSocket.close();
        } catch (Exception e) {
        }
    }
}
