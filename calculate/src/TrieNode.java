public class TrieNode {
    boolean isEnd;
    TrieNode[] nodeList = new TrieNode[26];

    public void put(char c,TrieNode node){
        nodeList[c-'a'] = node;
    }

    public TrieNode get(char c){
        return nodeList[c-'a'];
    }

    public boolean isContain(char c){
        return nodeList[c-'a'] != null;
    }

    public void setEnd(){
        isEnd = true;
    }

    public boolean isEnd(){
        return isEnd;
    }
}
