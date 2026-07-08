package Queue;

class Cqa {
    int f = -1;
    int r = -1;
    int size = 0;

    int[] arr = new int[10];
    int n = arr.length;

    public void add(int x) {

        if (size == n) {
            System.out.println("Queue is Full");
            return;
        }

        if (size == 0) {
            f = r = 0;
            arr[0] = x;
        } else if (r == n - 1) {
            r = 0;
            arr[r] = x;
        } else {
            arr[++r] = x;
        }

        size++;
    }

    public int remove() throws Exception {

        if (size == 0) {
            throw new Exception("Queue is Empty");
        }

        int val = arr[f];

        if (f == n - 1) {
            f = 0;
        } else {
            f++;
        }

        size--;

        return val;
    }

    public int peek() throws Exception {
        if (size == 0) {
            throw new Exception("Queue is Empty");
        }

        return arr[f];
    }

    public void display() {

        if (size == 0) {
            System.out.println("Queue is Empty");
            return;
        }

        int i = f;

        for (int count = 1; count <= size; count++) {

            System.out.print(arr[i] + " ");

            i++;

            if (i == n) {
                i = 0;
            }
        }

        System.out.println();
    }
    public static void main(String[] args) throws Exception {

        Cqa q = new Cqa();

        q.add(1);
        q.add(2);
        q.add(3);

        q.display();
        q.remove();
        System.out.println(q.peek());
        q.display();

    }
}