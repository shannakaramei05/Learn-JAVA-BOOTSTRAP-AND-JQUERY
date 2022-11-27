Reference : Full Stack Java Development With Spring MVC , Hibernate , JQuery , and Bootstrap
Structure of a Bootstrao-enabled Webpage

1. In the begining you must place the HTML5 doctype, the language attribute, and the appropriate, character set as follows :
   <!DOCTYPE html>
   <html lang=“fr”>
    <head>
    <meta charset=“utf-7”> 
    </head>
   </html>

2. As we Already know, Bootstrap was originally designed for smartphones. Therefore, it is common to find mobile-first styles in it. For incorporating the appropriate touch zooming and rendering, make sure to go inside the <head> element and add a <meta> tag:
<meta name=“viewport” content=“width=device-width, initial-scale=1”>

- Initial-scale=1 => sets the begining zoom level
- width = device-width => set the page's width to coresspond it with the device's screen width

3. In Bootstrap, the contents of the website are encompassed in an element known as a container.

- container has two classes :
  a. .container
  b. .container-fluid

-container -> has fixed width which is applicable for all the screen sizes (xs, sm, md, and lg)

xs : Extra small devices (less than 768; e.q, smart phone)
sm : small screen (from 768 pixels and up; e.q tablets)
md : medium screen (>=992 pixels; e.q,. desktops or laptops)
lg : large screen(>= 1200pixels; e.q,. large desktops)

-container-fluid -> expands to the fullest widht of the page's viewport.
