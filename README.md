# Building REST services with Spring
 *REST has quickly become the de-facto standard for building web services on the web because they’re easy to build and easy to consume.
  *This project was created through the YOutube tutorials, to access it click <a href="https://www.youtube.com/watch?v=9SGDpanrc8U&t=1361s" rel="nofollow">here</a>.
  ![Spring-Boot-RESTFul-Web-Services-CRUD-Example](https://user-images.githubusercontent.com/10946256/127257073-e2c58056-59c3-4d36-a6b6-2fab93ec4aed.jpg) 
<h2>
<a id="user-content-index-pushpin" class="anchor" aria-hidden="true" href="#index-pushpin">
 <svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true">
  <path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z">
  </path>
 </svg>
 Index
 </a>
 </h2>
 <ul>
<li><a href="#about">About</a></li>
<li><a href="#architecture">Architecture Diagram</a></li>
<li><a href="#coverage">Coverage Examples</a></li>
<li><a href="#code">Show me the code</a></li>
</ul>
<h2><a id="user-content-about--bulb" class="anchor" aria-hidden="true" href="#about--bulb"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>About <a name="user-content-about"></a> <g-emoji class="g-emoji" alias="bulb" fallback-src="https://github.githubassets.com/images/icons/emoji/unicode/1f4a1.png">💡</g-emoji></h2>
<p>Software Testing is a skill that you must fully grasp as a software engineer. It ensures that any code you write to production is more likely to contain less bugs.</p>
<p>In this repository you will see everything about some types of tests implemented that were presented in the <a href="https://amigoscode.com/courses/software-testing" rel="nofollow">course</a>:</p>
<ul>
<li>Unit Testing</li>
<li>Integration Testing</li>
<li>Testing External Services</li>
<li>Mocking with Mockito</li>
<li>Test Driven Development -<code>TDD</code></li>
</ul>
<h2><a id="user-content-architecture-diagram--pencil2" class="anchor" aria-hidden="true" href="#architecture-diagram--pencil2"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>Architecture Diagram <a name="user-content-architecture"></a> <g-emoji class="g-emoji" alias="pencil2" fallback-src="https://github.githubassets.com/images/icons/emoji/unicode/270f.png">✏️</g-emoji></h2>
<ul>
<li>This diagram shows how the system and its layers were separated to understand each part of the tests.
</li>
</ul>

![1_i5wQ5OHuTRMa_LHzlMXIHg](https://user-images.githubusercontent.com/10946256/127258640-caf8ac12-5c2a-40bf-bc43-64cf01d5736f.png)

<h4><a id="user-content-intellij-idea" class="anchor" aria-hidden="true" href="#intellij-idea"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>IntelliJ IDEA</h4>

![intelij](https://user-images.githubusercontent.com/10946256/127258691-af62823b-c0d2-4a62-b0ca-91c7430b044a.PNG)


<h2><a id="user-content-show-me-the-code--computer" class="anchor" aria-hidden="true" href="#show-me-the-code--computer"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>Show me the code <a name="user-content-code"></a> <g-emoji class="g-emoji" alias="computer" fallback-src="https://github.githubassets.com/images/icons/emoji/unicode/1f4bb.png">💻</g-emoji></h2>

![aCapture](https://user-images.githubusercontent.com/10946256/127258854-7c232ee2-7b5b-46fa-88ff-b3a52a0410ef.PNG)

![asCapture](https://user-images.githubusercontent.com/10946256/127259010-4b3f88c3-1399-4740-8ff5-49db741da243.PNG)




