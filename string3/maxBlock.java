public class maxBlock{
public int maxBlock(String str) {
    if (str.length() == 0) return 0;

    int maxBlock = 1;
    int currentBlock = 1;

    for (int i = 1; i < str.length(); i++) {
        if (str.charAt(i) == str.charAt(i - 1)) {
            currentBlock++;
        } else {
            maxBlock = Math.max(maxBlock, currentBlock);
            currentBlock = 1;
        }
    }
    return Math.max(maxBlock, currentBlock);
}


}