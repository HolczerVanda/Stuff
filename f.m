0;
function y = f(x)
  y = sin(x);
end
function y = first_deriv(x, h)
  y = (f(x + h) - f(x))/h;
end
function d = first_deriv_vector(x, y, i)
  d = (y(i+1)-y(i))/(x(i+1)-x(i));
end
function i = rectangle1(a, b, n)
  h = (b-a)/n;
  i = 0;
  for j=0:n-1
    i += f(a+j*h);
  end
  i *= h;
end
function i = rectangle1_v1(a, b, n)
  h = (b-a)/n;
  x = a:h:b;
  i = 0;
  y = f(x);
  i = sum(y(1:n))*h;
end
function i = rectangle1_v2(x, y)
  n = length(x)-1;
  h = x(2)-x(1);
  i = sum(y(1:n))*h;
end
function t = trape(a, b, n)
  h = (b-a)/n;
  x = a:h:b;
  i = 0;
  y = f(x);
  for i = 1:n
    t += (y(i)+y(i+1));
  endfor
  t = T*h/2;
end

