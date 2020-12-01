// 字典树

/**
 * 一种哈希树的变种，典型应用于统计和排序大量的字符串（但不仅限于字符串），所以经常被
 * 搜索引擎系统用于文本词频统计
 * 优点：最大限度的减少无畏的字符串比较，查询效率比hash表高
 * 核心思想：空间换时间，用字符串的公共前缀来降低查询时间的开销以达到提高效率的目的
 * 基本性质：根节点不包含字符，除根节点外每个节点只包含一个字符
 *          从根节点到某一节点，路径上经过的字符连接起来，为该节点对应的字符串
 *          每个节点的所有子节点包含的字符都不相同
 */

public class Trie {
    TrieNode root;
    public Trie(){
        root = new TrieNode();
    }
    public void insertNode(String word){
        TrieNode node = root;
        for (int i = 0;i<word.length();i++){
             char c = word.charAt(i);
             if (!node.isContain(c)){
                 node.put(c,new TrieNode());
             }
             node = node.get(c);
        }
        node.setEnd();
    }

    public TrieNode searchPrefix(String word){
        TrieNode node = root;
        for (int i = 0;i<word.length();i++){
            char c = word.charAt(i);
            if (node.isContain(c)){
                node = node.get(c);
            }else {
                return null;
            }
        }
        return node;
    }

    public boolean searchAll(String word){
        TrieNode node = searchPrefix(word);
        return node != null && node.isEnd();
    }

    public boolean startWith(String word){
        TrieNode node = searchPrefix(word);
        return node != null;
    }
}


