package chapter10.problem5;

/**
 * Created by omarpaladines on 8/3/16.
 */
public class SparseSearch {

    /**
     *
     * @param a
     * @param mid
     * @param low
     * @return The index of the first non-empty string in the array to the left of mid. If there is no such string, it
     * returns the middle index.
     */
    int getFirstNonEmpty(String[] a, int mid, int low) {
        int index = -1;
        for (int i = mid; i >= low; i--) {
            if (!a[i].isEmpty()) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            return mid + 1;
        } else {
            return index;
        }
    }

    /**
     *
     * @param a
     * @param s
     * @param low
     * @param high
     * @return Returns the index of the string s in the array s between indices low and high, -1 if not there.
     */
    int sparseSearchRecursive(String [] a, String s, int low, int high) {
        if (low > high) return -1;

        int mid = (low + high) / 2;

        int compare = a[mid].compareTo(s);

        if (compare == 0) {
            return mid;
        } else {
            if (a[mid].isEmpty()) {
                int index = getFirstNonEmpty(a, mid, low);
                if (a[index].equals(s)) return index;
                if (index == 0) index = mid + 1;
                return sparseSearchRecursive(a, s, index, high);

            } else if (compare < 0) {
                return sparseSearchRecursive(a,s, mid + 1, high);
            } else {
                return sparseSearchRecursive(a,s, low, mid - 1);
            }
        }
    }

    /**
     *
     * @param a
     * @param s
     * @return  Returns the index of the string s in the array s between indices low and high, -1 if not there.
     */
    int sparseSearch(String[] a, String s) {
        return sparseSearchRecursive(a, s, 0, a.length - 1);
    }
}
