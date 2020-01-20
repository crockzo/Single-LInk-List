import java.util.Scanner;

class ListNode{
    private int info;
    public ListNode next;
    public ListNode(){

    }
    public ListNode(int info){
        this.info = info;
    }
}

public class SingleLinkLIst {
    private static int ele;
    private static Scanner scan = new Scanner(System.in);
    private static ListNode START = new ListNode() , LAST = new ListNode();
    private static ListNode loc , locp , currentPos;

    public static void main(String[] args){
        boolean flag = true;
        int choice ;
        START.next = null;
        while(flag){
            System.out.println("AVAILABLE CHOICES");
            System.out.println("1 : INSERT NODE");
            System.out.println("2 : INSERT NODE AT PERTICUALAR POSITION");
            System.out.println("3 : INSERT AT FIRST POSITION");
            System.out.println("4 : DELETE A NODE");
            System.out.println("5 : DELETE A NODE AT A PERTICULAR POSITION");
            System.out.println("6 : TRAVERSE THE LINK LIST");
            System.out.println("7  :");

            choice = scan.nextInt();

            switch(choice){
                case 1 : insertNode();
                break;
                case 2 : insertAtPosition();
                break;
            }
        }
    }

    private static void insertNode(){
        if(START.next == null){
            System.out.print("\nENTER FIRST ELEMENT : ");
            ele = scan.nextInt();
            ListNode newNode = new ListNode(ele);
            START.next = newNode;
            newNode.next = null;
            LAST = newNode;
        }else{
            /*ListNode temp;
            temp = START;
            while(temp.next!=null){

            }*/
            System.out.print("\nENTER ELEMENT : ");
            ele = scan.nextInt();
            ListNode newNode = new ListNode(ele);
            newNode.next = null;
            LAST = newNode;
        }
    }

    private static void insertAtPosition(){
        int position , i = 1;
        System.out.println("ENTER THE POSITION : ");
        position = scan.nextInt();
        currentPos = START;
        while(i<=position){
            if(currentPos.next == null){
                System.out.println("NOT ENOUGH POSITION");
                break;
            }else{
                currentPos.next = (currentPos.next).next;
            }
        }
        if(currentPos.next == null){

        }
    }
}
