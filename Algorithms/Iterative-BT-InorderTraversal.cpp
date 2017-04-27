/*
* Recursive solution is trivial..
* But iterative one with using stack is quite nice.
*/
vector<int> inorderTraversal(TreeNode* root) {

    vector<int> nodes;
    stack<TreeNode*> toVisit;
    TreeNode* curNode = root;

    while (curNode != nullptr || !toVisit.empty()) {
    
        if (curNode != nullptr ) {
            toVisit.push(curNode);
            curNode = curNode -> leftChildPtr;
        }
        else {
            curNode = toVisit.top();
            toVisit.pop();
            nodes.push_back(curNode -> item);
            curNode = curNode -> rightChildPtr;
        }
    }
    return nodes;
}
