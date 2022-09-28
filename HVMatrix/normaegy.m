x=[4,3,2];
s=0;
[m,n]=size(x);

for i=1:n
    s=s+abs(x(i));
end
s
    