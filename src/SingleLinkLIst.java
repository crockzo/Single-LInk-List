import java.util.Scanner;

class ListNode{
    private int info;
    public ListNode next;
    public ListNode(){ }
    public ListNode(int info){
        this.info = info;
        this.next = null;
    }
    public int getInfo(){
        return info;
    }
}

public class SingleLinkLIst {
    private static int ele;
    private static Scanner scan = new Scanner(System.in);
    private static ListNode START = null  , LAST = null;
    private static ListNode loc = null, locp = null, currentPos;

    public static void main(String[] args){
        boolean flag = true;
        int choice ;
        while(flag){
            System.out.println("AVAILABLE CHOICES");
            System.out.println("1 : INSERT NODE");
            System.out.println("2 : INSERT AT FIRST POSITION");
            System.out.println("3 : INSERT AT END");
            System.out.println("4 : INSERT NODE AT PERTICUALAR POSITION");
            System.out.println("5 : DELETE THE FIRST NODE");
            System.out.println("6 : DELETE THE END NODE");
            System.out.println("7 : DELETE A NODE AT A PERTICULAR POSITION");
            System.out.println("8 : FIND A NODE");
            System.out.println("9 : TRAVERSE THE LINK LIST");
            System.out.println("10 : EXIT");


            choice = scan.nextInt();

            switch(choice){
                case 1 : insertNode();
                break;
                case 2 : insertFirst();
                break;
                case 3: insertEnd();
                break;
                case 4: insertPos();
                break;
                case 5: deleteFirst();
                break;
                case 6 : deleteEnd();
                break;
                case 7: deleteNode();
                break;
                case 8: findNode();
                break;
                case 9: readList();
                break;
                case 10:
                    System.out.println("END OF SINGLE LINK LIST");
                    flag = false;
                    break;
                default :
                    System.out.println("WRONG CHOICE");
            }
        }

    }

    private static void insertNode(){
        if(START == null){
            System.out.print("\nENTER FIRST ELEMENT : ");
            ele = scan.nextInt();
            ListNode newNode = new ListNode(ele);
            START = newNode;
            LAST = newNode;
        }else{
            System.out.print("\nENTER ELEMENT : ");
            ele = scan.nextInt();
            ListNode newNode = new ListNode(ele);
            LAST.next = newNode;
            LAST = newNode;
        }
    }


    private static void insertFirst(){
        System.out.print("\nENTER ELEMENT : ");
        ele = scan.nextInt();
        ListNode newList = new ListNode(ele);
        newList.next = START;
        START = newList;
    }
    private static void insertPos(){
        int pos , i = 1;
        System.out.println("ENTER POSITION : ");
        pos = scan.nextInt();
        currentPos= START;
        while(currentPos!=null && i<pos){

            currentPos = currentPos.next;
            i++;
        }
        if(currentPos==null){
            System.out.println("POSITION NOT FOUND");
        }else{
            System.out.println("ENTER ELEMENT : ");
            ele = scan.nextInt();
            ListNode newNode = new ListNode(ele);
            newNode.next = currentPos.next;
            currentPos.next = newNode;
        }

    }

    private static void insertEnd(){
        System.out.println("ENTER ELEMENT : ");
        ele = scan.nextInt();
        ListNode newNode = new ListNode(ele);
        LAST.next = newNode;
        LAST = newNode;
    }
    private static void readList(){
        ListNode pos;
        pos = START;
        while(pos != null){
            System.out.println(pos.getInfo());
            pos = pos.next;
        }
    }

    private static void deleteNode(){
        int pos , i = 1;
        System.out.println("ENTER POSITION : ");
        pos = scan.nextInt();
        currentPos= START;
        while(currentPos!=null && i<pos){
            locp = currentPos;
            currentPos = currentPos.next;
            i++;
        }
        if(currentPos==null){
            System.out.println("ELEMENT NOT FOUND");
        }else{
            locp.next = currentPos.next;
        }
    }

    private static void deleteEnd(){
        currentPos = START;
        while(currentPos.next!=null){
            locp = currentPos;
            currentPos = currentPos.next;
        }
        locp.next = null;
        LAST = currentPos;
    }

    private static  void deleteFirst(){
        START = START.next;
    }

    private static void findNode(){
        int eleFind , count = 0;
        int post = 0;
        System.out.println("ENTER A ELEMENT TO FIND");
        eleFind = scan.nextInt();
        currentPos = START;
        while(currentPos!=null){
            if(currentPos.getInfo()==eleFind){
                count = count + 1;

                post = count;
                break;
            }
            currentPos = currentPos.next;
            count = count + 1;
        }
        if(post == 0){
            System.out.println("ELEMENT NOT FOUND");
        }else{
            System.out.println("ELEMENT FOUND AT " + post + " POSITION ");
        }
    }
}
