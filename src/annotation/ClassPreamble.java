package annotation;

/*
 	Annotations, a form of metadata, provide data about a program that is not part of the 
 	program itself. Annotations have no direct effect on the operation of the code they annotate.
 	
	-	Information for the compiler - Annotations can be used by the compiler to detect errors or suppress warnings.
	-	Compile-time and deployment-time processing - Software tools can process annotation information to generate code, XML files, and so forth.
	-	Runtime processing - Some annotations are available to be examined at runtime.
	
	Class instance creation expression:
	    new @Interned MyObject();
	Type cast:
	    myString = (@NonNull String) str;
	implements clause:
	    class UnmodifiableList<T> implements
	        @Readonly List<@Readonly T> { ... }
	Thrown exception declaration:
	    void monitorTemperature() throws
	        @Critical TemperatureException { ... }
	        
	-	The predefined annotation types defined in java.lang are @Deprecated, @Override, and @SuppressWarnings.
 */

import java.lang.annotation.Documented;

@Documented
@interface ClassPreamble {
	   String author();
	   String date();
	   int currentRevision() default 1;
	   String lastModified() default "N/A";
	   String lastModifiedBy() default "N/A";
	   // Note use of array
	   String[] reviewers();
	}

/*
 	Annotations that apply to other annotations are called meta-annotations. There are several meta-annotation types defined in java.lang.annotation.
 	
 	@Retention @Retention annotation specifies how the marked annotation is stored:

		RetentionPolicy.SOURCE - The marked annotation is retained only in the source level and is ignored by the compiler.
		RetentionPolicy.CLASS - The marked annotation is retained by the compiler at compile time, but is ignored by the Java Virtual Machine (JVM).
		RetentionPolicy.RUNTIME - The marked annotation is retained by the JVM so it can be used by the runtime environment.

	@Target @Target annotation marks another annotation to restrict what kind of Java elements the annotation can 
		be applied to. A target annotation specifies one of the following element types as its value:

		ElementType.ANNOTATION_TYPE can be applied to an annotation type.
		ElementType.CONSTRUCTOR can be applied to a constructor.
		ElementType.FIELD can be applied to a field or property.
		ElementType.LOCAL _VARIABLE can be applied to a local variable.
		ElementType.METHOD can be applied to a method-level annotation.
		ElementType.PACKAGE can be applied to a package declaration.
		ElementType.PARAMETER can be applied to the parameters of a method.
		ElementType.TYPE can be applied to any element of a class.
		
	@Inherited 
	@Inherited annotation indicates that the annotation type can be inherited from the super class. 
		(This is not true by default.) When the user queries the annotation type and the class has no 
		annotation for this type, the class' superclass is queried for the annotation type. This annotation applies only to class declarations.

	@Repeatable 
	@Repeatable annotation, introduced in Java SE 8, indicates that the marked annotation 
		can be applied more than once to the same declaration or type use. For more information, see Repeating Annotations.
 */
