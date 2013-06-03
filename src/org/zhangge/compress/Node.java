/**  
 * @Title: Node.java 
 * @Package org.zhangge.compress 
 * @Description: TODO
 * @author zhgeaits@gmail.com
 * @date 2013-5-19 下午12:14:31 
 * @version V1.0
*/ 
package org.zhangge.compress;

/**
 * @project Compress
 * @file org.zhangge.compress.Node.java
 * @author zhangge
 * @email zhgeaits@gmail.com
 * @date 2013-5-19
 * @description
 *
 *
 */

public class Node {

	Byte value;//字符值
	int weight;//权重
	short code;//编码，0或1
	Node parent = null;
	Node lchild = null;
	Node rchild = null;
	
	public Node(Byte value, int weight) {
		this.value = value;
		this.weight = weight;
	}
}
