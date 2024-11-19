import React from 'react';
import ComponentCreator from '@docusaurus/ComponentCreator';

export default [
  {
    path: '/did-verifier-server/__docusaurus/debug',
    component: ComponentCreator('/did-verifier-server/__docusaurus/debug', '8bf'),
    exact: true
  },
  {
    path: '/did-verifier-server/__docusaurus/debug/config',
    component: ComponentCreator('/did-verifier-server/__docusaurus/debug/config', 'baa'),
    exact: true
  },
  {
    path: '/did-verifier-server/__docusaurus/debug/content',
    component: ComponentCreator('/did-verifier-server/__docusaurus/debug/content', 'e1b'),
    exact: true
  },
  {
    path: '/did-verifier-server/__docusaurus/debug/globalData',
    component: ComponentCreator('/did-verifier-server/__docusaurus/debug/globalData', 'e0b'),
    exact: true
  },
  {
    path: '/did-verifier-server/__docusaurus/debug/metadata',
    component: ComponentCreator('/did-verifier-server/__docusaurus/debug/metadata', '69a'),
    exact: true
  },
  {
    path: '/did-verifier-server/__docusaurus/debug/registry',
    component: ComponentCreator('/did-verifier-server/__docusaurus/debug/registry', 'a42'),
    exact: true
  },
  {
    path: '/did-verifier-server/__docusaurus/debug/routes',
    component: ComponentCreator('/did-verifier-server/__docusaurus/debug/routes', 'e73'),
    exact: true
  },
  {
    path: '/did-verifier-server/blog',
    component: ComponentCreator('/did-verifier-server/blog', 'dd2'),
    exact: true
  },
  {
    path: '/did-verifier-server/blog/archive',
    component: ComponentCreator('/did-verifier-server/blog/archive', '591'),
    exact: true
  },
  {
    path: '/did-verifier-server/blog/authors',
    component: ComponentCreator('/did-verifier-server/blog/authors', 'c7f'),
    exact: true
  },
  {
    path: '/did-verifier-server/blog/authors/all-sebastien-lorber-articles',
    component: ComponentCreator('/did-verifier-server/blog/authors/all-sebastien-lorber-articles', 'dc3'),
    exact: true
  },
  {
    path: '/did-verifier-server/blog/authors/yangshun',
    component: ComponentCreator('/did-verifier-server/blog/authors/yangshun', '04a'),
    exact: true
  },
  {
    path: '/did-verifier-server/blog/first-blog-post',
    component: ComponentCreator('/did-verifier-server/blog/first-blog-post', '1b0'),
    exact: true
  },
  {
    path: '/did-verifier-server/blog/long-blog-post',
    component: ComponentCreator('/did-verifier-server/blog/long-blog-post', 'c42'),
    exact: true
  },
  {
    path: '/did-verifier-server/blog/mdx-blog-post',
    component: ComponentCreator('/did-verifier-server/blog/mdx-blog-post', '5a7'),
    exact: true
  },
  {
    path: '/did-verifier-server/blog/tags',
    component: ComponentCreator('/did-verifier-server/blog/tags', '998'),
    exact: true
  },
  {
    path: '/did-verifier-server/blog/tags/docusaurus',
    component: ComponentCreator('/did-verifier-server/blog/tags/docusaurus', 'de0'),
    exact: true
  },
  {
    path: '/did-verifier-server/blog/tags/facebook',
    component: ComponentCreator('/did-verifier-server/blog/tags/facebook', '07c'),
    exact: true
  },
  {
    path: '/did-verifier-server/blog/tags/hello',
    component: ComponentCreator('/did-verifier-server/blog/tags/hello', 'de8'),
    exact: true
  },
  {
    path: '/did-verifier-server/blog/tags/hola',
    component: ComponentCreator('/did-verifier-server/blog/tags/hola', 'cc5'),
    exact: true
  },
  {
    path: '/did-verifier-server/blog/welcome',
    component: ComponentCreator('/did-verifier-server/blog/welcome', '416'),
    exact: true
  },
  {
    path: '/did-verifier-server/markdown-page',
    component: ComponentCreator('/did-verifier-server/markdown-page', 'a1e'),
    exact: true
  },
  {
    path: '/did-verifier-server/docs',
    component: ComponentCreator('/did-verifier-server/docs', 'f3c'),
    routes: [
      {
        path: '/did-verifier-server/docs/next',
        component: ComponentCreator('/did-verifier-server/docs/next', '112'),
        routes: [
          {
            path: '/did-verifier-server/docs/next',
            component: ComponentCreator('/did-verifier-server/docs/next', 'b48'),
            routes: [
              {
                path: '/did-verifier-server/docs/next/did-verifier-server/api/Verifier_API_ko',
                component: ComponentCreator('/did-verifier-server/docs/next/did-verifier-server/api/Verifier_API_ko', '554'),
                exact: true,
                sidebar: "tutorialSidebar"
              },
              {
                path: '/did-verifier-server/docs/next/did-verifier-server/db/OpenDID_TableDefinition_Verifier',
                component: ComponentCreator('/did-verifier-server/docs/next/did-verifier-server/db/OpenDID_TableDefinition_Verifier', '049'),
                exact: true,
                sidebar: "tutorialSidebar"
              },
              {
                path: '/did-verifier-server/docs/next/did-verifier-server/errorCode/Verifier_ErrorCode',
                component: ComponentCreator('/did-verifier-server/docs/next/did-verifier-server/errorCode/Verifier_ErrorCode', '1b1'),
                exact: true,
                sidebar: "tutorialSidebar"
              },
              {
                path: '/did-verifier-server/docs/next/did-verifier-server/installation/OpenDID_VerifierServer_InstallationAndOperation_Guide_ko',
                component: ComponentCreator('/did-verifier-server/docs/next/did-verifier-server/installation/OpenDID_VerifierServer_InstallationAndOperation_Guide_ko', 'b12'),
                exact: true,
                sidebar: "tutorialSidebar"
              }
            ]
          }
        ]
      },
      {
        path: '/did-verifier-server/docs',
        component: ComponentCreator('/did-verifier-server/docs', '22a'),
        routes: [
          {
            path: '/did-verifier-server/docs',
            component: ComponentCreator('/did-verifier-server/docs', 'c2d'),
            routes: [
              {
                path: '/did-verifier-server/docs/did-verifier-server/api/Verifier_API_ko',
                component: ComponentCreator('/did-verifier-server/docs/did-verifier-server/api/Verifier_API_ko', 'cbd'),
                exact: true,
                sidebar: "tutorialSidebar"
              },
              {
                path: '/did-verifier-server/docs/did-verifier-server/db/OpenDID_TableDefinition_Verifier',
                component: ComponentCreator('/did-verifier-server/docs/did-verifier-server/db/OpenDID_TableDefinition_Verifier', '21b'),
                exact: true,
                sidebar: "tutorialSidebar"
              },
              {
                path: '/did-verifier-server/docs/did-verifier-server/errorCode/Verifier_ErrorCode',
                component: ComponentCreator('/did-verifier-server/docs/did-verifier-server/errorCode/Verifier_ErrorCode', '118'),
                exact: true,
                sidebar: "tutorialSidebar"
              },
              {
                path: '/did-verifier-server/docs/did-verifier-server/installation/OpenDID_VerifierServer_InstallationAndOperation_Guide_ko',
                component: ComponentCreator('/did-verifier-server/docs/did-verifier-server/installation/OpenDID_VerifierServer_InstallationAndOperation_Guide_ko', '9de'),
                exact: true,
                sidebar: "tutorialSidebar"
              }
            ]
          }
        ]
      }
    ]
  },
  {
    path: '/did-verifier-server/',
    component: ComponentCreator('/did-verifier-server/', '6ec'),
    exact: true
  },
  {
    path: '*',
    component: ComponentCreator('*'),
  },
];
