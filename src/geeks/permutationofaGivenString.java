package geeks;
import java.util.*;
public class permutationofaGivenString {
	
		 public:
				vector<string> ans=new vector<String>;
				void genrateComination(string S,int l,int r)
				{
				    if(l==r)
				        ans.push_back(S);
				        
				    for(int i=l;i<=r;i++)
				    {
				        swap(S[i],S[l]);
				        genrateComination(S,l+1,r);
				        swap(S[i],S[l]);
				    }
				    
				}
				vector<string>find_permutation(string S)
				{
				    sort(S.begin(),S.end()); 
				    genrateComination(S,0,S.size()-1);
			        sort(ans.begin(),ans.end());
				    ans.erase(unique(ans.begin(), ans.end()), ans.end());
				    return ans;
				}
	    }

