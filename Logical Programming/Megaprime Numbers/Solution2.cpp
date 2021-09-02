#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <cassert>
#include <iterator>
using namespace std;

typedef long long ll;

const int MAX = 50000007;
const int CMAX = MAX/8+1;
char pr[CMAX];
char prh[1000000007/8+1];

ll powmod(ll a, ll k, ll mod) {
  __int128 aa= a,res=1;
  while (k) {
    if (k&1) {
      res *= aa;
      res %= mod;
    }
    aa *= aa;
    aa %= mod;
    k >>= 1;
  }
  return res;
}

bool miller_prime(ll n, ll base) {
    int r = 0;
    ll b = n-1;
    while (b % 2 == 0) {
        r++; b/=2;
    }
    ll x = powmod(base,b,n);
    if (x == 1 || x == n-1) return true;
    for (int i=1; i<r; ++i) {
        x = ((__int128)x)*x % n;
        if (x == n-1) return true;
    }
    return false;
}

// pseudoprime test
bool is_prime(ll n) {
    static int bases[] = {2,3,5,7,11,1299827};
    // throw in a random prime to counter pick the test cases
    for (int i=0; i<6; ++i) {
        if (n==bases[i]) return true;
        if (!miller_prime(n,bases[i]))
            return false;
    }
    return true;
}

bool good(ll a) {
  //cout << "good " << a << endl;
  if (a < 10) return a==2 || a == 3 || a==5 || a==7;
  return good(a/10) && good(a%10);
}

ll next(ll a) {
  if (!a) return 2;
  switch (a % 10) {
    case 0:
    case 2:
    return a+1;
    case 3:
    case 5:
    return a+2;
    case 7:
    return next(a/10)*10 + 2;
  }
  assert(false); return 0;
}

ll up(ll a) {
  vector<int> d;
  while(a) {d.push_back(a%10); a /= 10;}
  for (int i=d.size()-1; i>=0; --i) {
    switch(d[i]) {
      case 2: case 3: case 5: case 7: continue;
      case 0: case 1: d[i] = 2; break;
      case 4: d[i] = 5; break;
      case 6: d[i] = 7; break;
      case 8: case 9: 
      d[i] = 2;
      int j=i+1;
      while (j < d.size() && d[j] == 7) {
        d[j++] = 2;
      }
      if (j == d.size()) {
        d.push_back(2);
      } else {
        switch (d[j]) {
          case 2: d[j] = 3; break;
          case 3: d[j] = 5; break;
          case 5: d[j] = 7; break;
        }
      }
    }
    for (int j=0; j<i; ++j) d[j] = 2;
    break;
  }
  ll res=0;
  ll pow=1;
  for (int i=0; i<d.size(); ++i) {
    res += pow * d[i];
    pow *= 10;
  }
  return res;
}

int main() {
  ll a,b; cin >> a >> b;
  //for (int i=0; i<1000; ++i) printf("%d %lld\n",i,up(i));
  int cnt=0;
  for (a = up(a); a <= b; a = next(a)) {
    //fprintf(stderr,"a=%lld\n",a);
    assert(good(a));
    if (is_prime(a)) cnt++;
  }
  cout << cnt << endl;
  return 0;
}