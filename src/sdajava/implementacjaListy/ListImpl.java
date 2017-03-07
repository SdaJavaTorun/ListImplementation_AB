package sdajava.implementacjaListy;

/**
 * Created by Andrzej on 06.03.2017.
 */

    class ListImpl{  //klasa zagniezdzona

        private Node begin;
        private Node end;

        public ListImpl () {  //zerowanie wartosci
            this.begin = null;
            this.end = null; //"this." jest opcjonalne. Jesli nazwy isę nie powtarzaja
        }

        public void addElement(String value){

            Node node = new Node(value,null, null);

            if(checkIsEmpty()){
                begin = node;
                end = node;
            }
            else{
                Node pm = begin;

                while(pm !=null) {
                    pm.getNext();

                    if(pm == begin){
                        node.setNext(pm);
                        pm.setPrev(node);
                        begin = node;
                        break;
                    }
                    else {
                        node.setNext(pm);
                        node.setPrev(pm.getPrev());
                        pm.getPrev().setPrev(node);
                        pm.setPrev(node);
                        break;
                    }

                }
                if(pm==null) {
                    end.setNext(node);
                    node.setPrev(end);
                    end =node;
                }

            }
        }
        public boolean checkIsEmpty(){
            return (begin ==null);
        }

        public void showList() {

            Node list = end;
            while(list !=null){
                System.out.println(list.getValue());
                list = list.getPrev();
            }

        }

        public int sizeList() {
            Node list = begin;
            int counter = 0;
            while (list != null){
                counter++;
                list = list.getNext();  // przeliterowanie po calości
            }
            return counter;
        }

    }

