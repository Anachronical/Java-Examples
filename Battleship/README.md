##
# Battleship

#

# Socket Game

## **????????????**

1. 1. **????.**

## �Battleship Socket Game&quot; e ???? ???????? ?? ??????????? ? ???-?????? ????? ?????????? ???????????? ???? ?? �???? ?? ?????? ??????&quot;.

## ? ?????? ????? ?????? ?? ??????? ?? ??????? ???????? ?? ???? ?????????? ? ???? ????? ????? ????? ?? ?????? ??????????????.

## ?? ?? ?? ????????? ?? ????????????? ????? ???????? ? ??????? ?? ?????? ?? ?????????? ??? ?????? ?? ???????????? java.net ? ?? ?? ?? ????????? ?????????? ????????? ?? ???????? ???????????? javax.swing.

## ?????? ? ??????????? ? ?????????? ?? java ??????? ?? ?????????? ??????????? ? ???????????? ??????? (proxy ???????), ???????? ?? ??????? ? ???????????? ? ?????????.

1. 2. **????????? ?????.**

## ??????????? ????? ?? �Battleship Socket Game&quot; e ????????.

1. 1.????????? ?? ???????(BattleShipServer) ???? ?? ?????? ???? ?? ????? ??? ?? ?????? ??????? (?????).

1. 2.????? ?????? ???????? ?????? ?????????? (BattleShipClient)???? ?????? ???? ????????? ????? ?? host-? (??? ??? &quot;localhost&quot;) ? ????? ?? port-? ?? ????? ?? ?? ????? ?? ?? ?????? ??????????? ?????????.

1. 3.???? ???????????? ?? ??????????? ???? &quot;BattleShipClient&quot; ???? ??????? ?? ?? ?????? ???.

1. 4.????????? ?? ??????? ?? ?? ??????? ??? ??????????? ??? ? ???????? ?????? ???? ?? ? ???????? ??????? ? ??????????? ?? 50 ??????? ? ???????? ?? 5 ???????.

1. 5.??? ?????? ????? ?? ?? ?????? ??? ??????? ?? ??????? ?? ???????? ???????????????? ?????? ? ?????????? ????????? ?? ????.

1. 6.??????? ??????? ?? ??? ??????? ???? ???? ???? ????? ? ????????? (?? ??????????? ?? ??????).

1. 7.????? ??????? ???? ?? ?????????? ?????? ?? ? ? ??????? ?? ?????????? ????????? ????????? ?????????? ?? ???????????? ?? ??????.

1. 8.?????? ?? ????? ?? ?????? ???? ?? ??:

1.
  1. a.????????? ?? ????? ?? ??????. ??? ??? ???? ?????? ??? ??????? (????????????) ??? ?? ??????? ?? ????????? ?????? ?? ??????????. ??? ??????? ?? ?????? ???? ?? ??????????? ?? ????? (10 ???????) ?????? ?? ???? ????????? ???????????.

1.
  1. b.??????? ?? ??????????. ??? ??????? ?? ?????? ???? ?? ??????????? ?? ????? (10 ???????) ???????? ?? ?? ??????????.

1. 9.???? ?? ?????? ???????? ?????? ???? ?? ???????? ? ??????. ?????? ????????? ??????? ????? ?? ??????????.

1. 3. **???????? ?? ?????????.**

## ?????????? ?? ????????? ? �Battleship Socket Game&quot; ? ????? ??????:

1. 1. ** BattleShipServer;**

## ???? ???? ? ????????????? ?????? ?? ???????????. ??? ?????? integer ????????????? ????? ?? ????? ?????? ??????? da ????? ?? ??????? ?? ???????. ??????? ????????? ????? Thread ? ???????? ?? ???? ????? ?? ?? ???????????? ?? ?? ?? ????????? ?? ????? ???? ????????????.

1. 2. ** BattleShip**** Client ****;**

## ???? ???? ? ????????????? ?????? ?? ???????????. ??? ?????? ??????????? ????? ? ?????. ????? ????????????? ?????????; ????? ?? ?????, ????? ?? ?????.???? ???? ????? ????????? ? InetAddress ??? ??????? ????? ??? ??????? ????????? ?? �BattleShipServer&quot;?? ??????? ????? ?? ??????????? ? �ServeOneClient&quot; ?? ???????? In/OutputStream o????? ?? ???????????. ??? ??????? ????????? ??????? ???? ??????? In/OutputStream o?????. �BattleShipClient&quot;???? ????????? ????? Thread ? ???????? ?? (????????? ?????? �listenToServer&quot;) ?? ????????? ?? ????.

1. 3. **ServeOneClient**** ;**

## ???? ???? ????? ?? ?????? ?????? ?? ?? ???????,InputStreamReader ? OutputStreamWriter. InputStreamReader-? ???? ???? ???????? ?? ?? ????? ?? ??????? ?? ????????? ????? ?? ????? ?? ?????? �BattleShipGameLogic&quot;.  OutputStreamWriter-a ???? ?? ????? ??????? �BattleShipGameLogic&quot;?? ?? ???? ?? (???????? ?? ??????) ?? ????? ??????? ?? ???????. ????? �ServeOneClient&quot;????????? ????? Thread ? ???????? run() ?????? ?? ?? ?? ??????? ? ???????? ????? ?? ???????? ?? ??????? ?? ????? ?????? ???? ??? ???? ?? ??????.

1. 4. **BattleshipGameLogic**** ;**

## ???? ???? ???????????? ?????????? ?????? ?????? ? ???????????.???? ???? ?? ????????? ????? Thread, ? ?? ???????? ???? ??????? ?? ??? ??????? ?????? ????????? ?? ????? �BattleshipClientThread&quot;. ???? ???? ???????????? ?? ????? ????? ???????????? ?? ????????????? ? ????????? ? ??????? ?? ?????? ? ? ???? ?? ??????? ???????????????? ?????? ????? �BattleshipClientThread&quot;???????.

1. 5. **BattleshipClientThread;**

## ???? ???? ????????? ?? ????? Thread ? ???????? ????? ???????? ?????? ?? ?? ???? ???? ????? ?????? ?? ??????: ??????????? ?? ?????, ???????? ?? ??????????.

1. 6. **BattleShipGUI;**

## ???? ???? ????????? ?? ????? JFrame ? ???????????? ?????????? ???????? ????????? ?? ???????????. ???? ???? ????????? ? ?????? ????? ?? ?????????? ??? ???????? ?? ????? ??? ? ????????? ?????? ??? ???????? ?? ???????. ???? ???? ???????? ???? ???? ? BorderFactory, BoxLayout, JButton, JLabel ? JPanel ?? ???????????? javax.swing.