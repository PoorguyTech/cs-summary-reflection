/* Licensed under Apache-2.0 @梦境迷离 */
package io.github.dreamylost

/**
  * @author 梦境迷离 dreamylost
  * @since 2020-06-07
  * @version v1.0
  */
object TreeNodeData {

  def treeData3(): TreeNode = {
    val root = new TreeNode(2)
    val r1 = new TreeNode(3)
    val l1 = new TreeNode(1)
    root.right = r1
    r1.left = l1
    root
  }

  def treeData1(): TreeNode = {
    val root = new TreeNode(2147483647)
    root
  }

  def treeData3_1(): TreeNode = {
    val root = new TreeNode(1)
    val r1 = new TreeNode(5)
    val l1 = new TreeNode(3)
    root.right = r1
    r1.left = l1
    root
  }

  def treeData3_2(): TreeNode = {
    val root = new TreeNode(1)
    val r1 = new TreeNode(5)
    val l1 = new TreeNode(5)
    root.right = r1
    root.left = l1
    root
  }

  def treeData3_3(): TreeNode = {
    val root = new TreeNode(5)
    val r1 = new TreeNode(5)
    val l1 = new TreeNode(6)
    root.right = r1
    root.left = l1
    root
  }

  //搜索树
  def treeData3_4(): TreeNode = {
    val root = new TreeNode(2)
    val r1 = new TreeNode(3)
    val l1 = new TreeNode(1)
    root.right = r1
    root.left = l1
    root
  }

  //搜索树
  def treeData3_5(): TreeNode = {
    val root = new TreeNode(1)
    val r1 = new TreeNode(2)
    val l1 = new TreeNode(0)
    root.right = r1
    root.left = l1
    root
  }

  //10 11
  def treeData3_6(): TreeNode = {
    val root = new TreeNode(1)
    val r1 = new TreeNode(1)
    val l1 = new TreeNode(0)
    root.right = r1
    root.left = l1
    root
  }

  def treeData5_1(): TreeNode = {
    val n1 = new TreeNode(1)
    val n2 = new TreeNode(2)
    val n3 = new TreeNode(3)
    val n4 = new TreeNode(4)
    val n5 = new TreeNode(5)

    n1.left = n2
    n1.right = n3
    n2.right = n4
    n3.right = n5

    n1
  }

  def treeData11(): TreeNode = {
    val treeNode5 = new TreeNode(5)
    val treeNode4 = new TreeNode(4)
    val treeNode8 = new TreeNode(8)
    val treeNode11 = new TreeNode(11)
    val treeNode13 = new TreeNode(13)
    val treeNode4_ = new TreeNode(4)
    val treeNode7 = new TreeNode(7)
    val treeNode2 = new TreeNode(2)
    val treeNode5_ = new TreeNode(5)
    val treeNode1 = new TreeNode(1)

    treeNode5.left = treeNode4
    treeNode5.right = treeNode8
    treeNode4.left = treeNode11
    treeNode11.left = treeNode7
    treeNode11.right = treeNode2
    treeNode8.left = treeNode13
    treeNode8.right = treeNode4_
    treeNode4_.left = treeNode5_
    treeNode4_.right = treeNode1

    treeNode5
  }
}
